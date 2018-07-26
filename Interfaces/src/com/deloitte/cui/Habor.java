package com.deloitte.cui;

public class Habor {

	public static void main(String[] args) {
		Habor bostonHarbor = new Habor();
		RiverBarge barge = new RiverBarge();
		SeaPlane sPlane = new SeaPlane();
		
		bostonHarbor.givePermissionToDock(barge);
		bostonHarbor.givePermissionToDock(sPlane);
		
	}
	private void givePermissionToDock(Sailer s) {
		s.dock();
	}

}
