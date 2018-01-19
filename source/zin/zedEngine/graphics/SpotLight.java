package zin.zedEngine.graphics;

import zin.zedEngine.math.Vector3f;

public class SpotLight {

	private Vector3f position, color, attenuation;

	public SpotLight(Vector3f position, Vector3f color, Vector3f attenuation) {
		this.position = position;
		this.color = color;
		this.attenuation = attenuation;
	}

	public SpotLight(Vector3f position, Vector3f color) {
		this.position = position;
		this.color = new Vector3f(1);
		attenuation = new Vector3f(1, 0, 0);
	}

	public SpotLight(Vector3f position) {
		this.position = position;
		color = new Vector3f(1);
		attenuation = new Vector3f(1, 0, 0);
	}

	public Vector3f getPosition() {
		return position;
	}

	public void setPosition(Vector3f position) {
		this.position = position;
	}

	public Vector3f getColor() {
		return color;
	}

	public void setColor(Vector3f color) {
		this.color = color;
	}

	public Vector3f getAttenuation() {
		return attenuation;
	}

	public void setAttenuation(Vector3f attenuation) {
		this.attenuation = attenuation;
	}

}