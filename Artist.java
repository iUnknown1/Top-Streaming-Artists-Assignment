package com.javainterviewpoint;

	/* A node represents an artist */
	 class Artist {
	    private String name;
	    private Artist next;
	   // constructors
	    public Artist() {			
		}
	public Artist(String name, Artist next) {
		this.setName(name);
		this.setNext(next);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Artist getNext() {
		return next;
	}
	public void setNext(Artist next) {
		this.next = next;
	}
	 }

	/* The List TopStreamingArtists is composed of a series of artist names */
	 class TopStreamingArtists {
	    private Artist first;
	    public TopStreamingArtists(){
	      first = null;
	    }
	    public boolean isEmpty(){
	     return (first == null);
	    }
		public void displayList() {
			// TODO Auto-generated method stub
			
		}
		public void insert(String string) {
			// TODO Auto-generated method stub
			
		}
	 }


