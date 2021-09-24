package com.example.domain.pc.service;

import java.util.Date;
import java.util.List;

import com.example.domain.pc.model.Reg;

public interface PcService {
	public void RegPc(Reg reg);

	public List<Reg> getPcList(Reg reg);

	public Reg getPcOne(String name);

	public void updatePcOne(String name,
			String os,
			String cpu,
			double ghz,
			String gpu,
			int ram,
			int hddCapa,
			String byt,
			int ssdCapa,
			String byt2,
			String eth,
			String strwifi,
			String resolution,
			double lcd,
			String manufacturers,
			Date release_date,
			String description);

	public void deletePcOne(String name);



}
