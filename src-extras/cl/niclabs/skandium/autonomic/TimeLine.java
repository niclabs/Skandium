package cl.niclabs.skandium.autonomic;

import java.util.Collections;
import java.util.TreeMap;
class TimeLine {
	private TreeMap<Long,Integer> tl;
	TimeLine() {
		tl = new TreeMap<Long,Integer>();
	}
	void addActivity(Activity a) {
		addActivity(a.getTi(),a.getTf());
	}
	private void addActivity(long ti, long tf) {
		if (tl.size()==0) {
			tl.put(ti, 1);
			tl.put(tf, 0);
			return;
		}
		if (ti > tl.lastKey() || ti < tl.firstKey()) tl.put(ti, 0);
		else if (!tl.containsKey(ti)) tl.put(ti, tl.get(tl.floorKey(ti)));
		for (long l : tl.subMap(ti, tf).keySet()){
			tl.put(l, tl.get(l)+1);
		}
		if (tf > tl.lastKey()) tl.put(tf, 0);
		if (!tl.containsKey(tf)) tl.put(tf, tl.get(tl.floorKey(tf))-1);
	}
	void addActivity(Activity a, int maxThreads) {
		if (maxThreads < 1) throw new RuntimeException("Should not be here!");
		long ti = a.getTi();
		long d = a.getMuscleDuration();
		if (!tl.isEmpty()&&(((ti+d) > tl.firstKey()) && (ti < tl.lastKey()))) {
			boolean fits = false;
			while (!fits && ti < tl.lastKey()) {
				int max = Collections.max(tl.subMap(ti, ti+d).values());
				if ((max+1)>maxThreads) {
					ti = tl.higherKey(ti);
				} else fits = true; 
			}
		}
		addActivity(ti,ti+d);
		a.setTi(ti);
		a.setTf(ti+d);
	}
	int maxThreads(long from) {
		return Collections.max(tl.tailMap(from).values());
	}
}