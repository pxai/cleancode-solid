package io.pello.cleancode.samples.solid.isp.kernelsample.better;

public interface KernelCore {
	public KernelMessage shutdown ();
	
	public KernelMessage openFile (String name, User user);
	
	public KernelMessage createFile (String name, User user);
	
	public KernelMessage removeFile (String name, User user);
	
	public KernelMessage copyFile (String origin, String destiny, User user);
	
	public KernelMessage execute (Process process);
	
	public KernelMessage kill (Process process, int signal);
	
	public KernelMessage getChar ();
	
	public KernelMessage putChar (char c);
	
}
