package com.tut.MavenProject;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {

	
		
         private String courses;
         private String duration;
         
	
	

	public Certificate(String courses, String duration) {
			super();
			this.courses = courses;
			this.duration = duration;
		}




	



	public String getCourses() {
			return courses;
		}




		public void setCourses(String courses) {
			this.courses = courses;
		}




		public String getDuration() {
			return duration;
		}




		public void setDuration(String duration) {
			this.duration = duration;
		}




	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

}
