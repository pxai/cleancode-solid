package io.pello.cleancode.samples.solid.isp.kernelsample.better;

public class Display {
	private KernelIO kernel;
	
	public Display (KernelIO kernel) {
		this.kernel = kernel;
	}
	
	public KernelMessage putChar(char c) {
		return kernel.putChar(c);
	}
}
