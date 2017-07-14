package io.pello.cleancode.samples.solid.isp.kernelsample.better;

import java.util.Date;

public class Process {
	private Date date;
	private String command;
	private User user;
	private KernelCore kernel;
	
	public Process(KernelCore kernel, String command, User user) {
		this.kernel = kernel;
		this.command = command;
		this.user = user;
	}

	
	public KernelMessage shutdown () {
		return kernel.shutdown();
	}
	
	public KernelMessage openFile (String name, User user) {
		return kernel.openFile(name, user);
	}
	
	public KernelMessage createFile (String name, User user) {
		return kernel.createFile(name, user);
	}
	
	public KernelMessage removeFile (String name, User user) {
		return kernel.removeFile(name, user);
	}
	
	public KernelMessage copyFile (String origin, String destiny, User user) {
		return copyFile(origin, destiny, user);
	}
	
	public KernelMessage execute () {
		return kernel.execute(this);
	}
	
	public KernelMessage kill (Process process, int signal) {
		return kernel.kill(process, signal);
	}
	
	public KernelMessage getChar () {
		return kernel.getChar();
		
	}
	
	public KernelMessage putChar (char c) {
		return kernel.putChar(c);
	}

	public Date getDate() {
		return date;
	}

	public String getCommand() {
		return command;
	}
}
