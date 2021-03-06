package com.surelution.core.drivers.tc400;

import com.sun.jna.Native;

class LibraryFactory {
	private static Tc400Library tc400 = (Tc400Library)Native.loadLibrary("tc400.dll", Tc400Library.class);
	private static Kernel32Library kernel32 = (Kernel32Library)Native.loadLibrary("Kernel32", Kernel32Library.class);
	
	public static Tc400Library createTc400Library() {
		return tc400;
	}
	
	public static Kernel32Library createKernel32Library() {
		return kernel32;
	}
}
