package com.ddlab.rnd;

public class TestAnnotations {
	
	public static void processObject( Object obj ) {
		
		boolean flag = obj.getClass().isAnnotationPresent(Food.class);
		if( flag ) {
			Food food = obj.getClass().getAnnotation(Food.class);
			FoodType foodType = food.type();
			if( foodType == FoodType.VEG ) {
				System.out.println(obj+" is herbivorous ..");
			}
			else {
				System.out.println(obj+" is carnivorous ..");
			}
		}
	}
	
	public static void main(String[] args) {
		Cow cow = new Cow();
		Lion lion = new Lion();
		processObject(cow);
		processObject(lion);
	}
}
