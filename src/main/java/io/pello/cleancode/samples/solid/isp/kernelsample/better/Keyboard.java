package io.pello.cleancode.samples.solid.isp.kernelsample.better;

public class Keyboard {
	private KernelIO kernel;
	
	public Keyboard (KernelIO kernel) {
		this.kernel = kernel;
	}
	
	public KernelMessage putChar(char c) {
		return kernel.putChar(c);
	}
}
