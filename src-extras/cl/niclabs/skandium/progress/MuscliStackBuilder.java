package cl.niclabs.skandium.progress;

import cl.niclabs.skandium.skeletons.AbstractSkeleton;
import cl.niclabs.skandium.skeletons.DaC;
import cl.niclabs.skandium.skeletons.Farm;
import cl.niclabs.skandium.skeletons.For;
import cl.niclabs.skandium.skeletons.Fork;
import cl.niclabs.skandium.skeletons.If;
import cl.niclabs.skandium.skeletons.Map;
import cl.niclabs.skandium.skeletons.Pipe;
import cl.niclabs.skandium.skeletons.Seq;
import cl.niclabs.skandium.skeletons.SkeletonVisitor;
import cl.niclabs.skandium.skeletons.While;

class MuscliStackBuilder implements SkeletonVisitor {

	@Override
	public <P, R> void visit(Farm<P, R> skeleton) {
		// TODO Auto-generated method stub

	}

	@Override
	public <P, R> void visit(Pipe<P, R> skeleton) {
		// TODO Auto-generated method stub

	}

	@Override
	public <P, R> void visit(Seq<P, R> skeleton) {
		// TODO Auto-generated method stub

	}

	@Override
	public <P, R> void visit(If<P, R> skeleton) {
		// TODO Auto-generated method stub

	}

	@Override
	public <P> void visit(While<P> skeleton) {
		// TODO Auto-generated method stub

	}

	@Override
	public <P> void visit(For<P> skeleton) {
		// TODO Auto-generated method stub

	}

	@Override
	public <P, R> void visit(Map<P, R> skeleton) {
		// TODO Auto-generated method stub

	}

	@Override
	public <P, R> void visit(Fork<P, R> skeleton) {
		// TODO Auto-generated method stub

	}

	@Override
	public <P, R> void visit(DaC<P, R> skeleton) {
		// TODO Auto-generated method stub

	}

	@Override
	public <P, R> void visit(AbstractSkeleton<P, R> skeleton) {
		// TODO Auto-generated method stub

	}

}
