package chaosSimulator;

import java.util.LinkedList;

public class World {
	//class contains vars about the simulation
	private double armX = 0;
	private double armY = 0;
	private double velX = 0;
	private double velY = 0;
	private double homeX = 1.3;

	private LinkedList<Magnet> magnets = new LinkedList<Magnet>();
	
	public World() {
		
	}
	
	public void addMagnet(Magnet magnet) {
		if(Magnet.totalMagnets < Magnet.maxMagnets){
			//add magnet
			magnets.add(magnet);
			
		}else {
			//too many magnets
			System.out.println("too many magnets");
		}
	}
	
	public void removeMagnet(Magnet magnet) {
		magnet.destroyMagnet();
		magnets.remove(magnet);
	}
	
	//setters
	public void setArmX(double armX) {this.armX = armX;};
	public void setArmY(double armY) {this.armY = armY;};
	public void setVelX(double velX) {this.velX = velX;};
	public void setVelY(double velY) {this.velY = velY;};
	
	//getters
	public double getArmX() {return this.armX;};
	public double getArmY() {return this.armY;};
	public double getVelX() {return this.velX;};
	public double getVelY() {return this.velY;};
	public LinkedList<Magnet> getMagnets() {return this.magnets;};
	
}