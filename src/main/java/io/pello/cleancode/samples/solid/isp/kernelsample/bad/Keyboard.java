package io.pello.cleancode.samples.solid.isp.kernelsample.bad;

public class Keyboard {
	private Kernel kernel;
	
	public Keyboard (Kernel kernel) {
		this.kernel = kernel;
	}
	
	public KernelMessage putChar(char c) {
		return kernel.putChar(c);
	}
}
