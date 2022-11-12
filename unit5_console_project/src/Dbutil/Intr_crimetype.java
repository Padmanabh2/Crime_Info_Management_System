package Dbutil;

import Exception.Crimetypeexep;

public interface Intr_crimetype {

	public String addcrimetype(String cri_name) throws Crimetypeexep;
	
	public String altercrimetype(String cri_name, int id) throws Crimetypeexep;
	
}
