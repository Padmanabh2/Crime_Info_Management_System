package Dbutil;

import java.util.List;

import Beanclass.Crimetypebean;
import Exception.Crimetypeexep;

public interface Intr_crimetype {

	public String addcrimetype(String cri_name) throws Crimetypeexep;
	
	public String altercrimetype(String cri_name, int id) throws Crimetypeexep;
	
	public List<Crimetypebean> showcrimetype() throws Crimetypeexep;
	
}
