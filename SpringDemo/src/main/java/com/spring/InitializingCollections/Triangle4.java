package com.spring.InitializingCollections;

import java.util.List;

import com.spring.ObjectInjection.Point;

public class Triangle4 {


		private String type;
		private List<Point> points;
		public String getType() {
			return type;
		}



		public void setType(String type) {
			this.type = type;
		}



		public List<Point> getPoints() {
			return points;
		}



		public void setPoints(List<Point> points) {
			this.points = points;
		}
		

		public void draw() {
			System.out.println(type + " Triangle Drawn" + " with points:");
			for (Point point: points)
				System.out.println("( "+point.getX()+", "+point.getY()+")");
			

			
		}
	}


