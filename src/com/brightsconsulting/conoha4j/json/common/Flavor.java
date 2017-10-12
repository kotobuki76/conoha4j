package com.brightsconsulting.conoha4j.json.common;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flavor {
	public String id;
	public ArrayList<Link> links;
	public String name;
	public int disk;
	public int ram;
	public int rxtx_factor;
	public String swap;
	public int vcpus;
}
