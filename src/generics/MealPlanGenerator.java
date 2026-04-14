package generics;

// interface for meal plan
interface MealPlan {
    void make(); // abstract method to prepare meal
}

// veg meal class
class VegMeal implements MealPlan {
    public void make() {
        System.out.println("Veg Meal"); // printing veg meal preparation
    }
}

// keto meal class
class KetoMeal implements MealPlan {
    public void make() {
        System.out.println("Keto Meal"); // printing keto meal preparation
    }
}

// generic class to handle meals
class Meal<T extends MealPlan> {
    T meal; // generic variable of type MealPlan or its subclass

    // constructor
    Meal(T meal) {
        this.meal = meal; // assigning meal object
    }

    // serving meal
    void serve() {
        meal.make(); // calling make() method of the meal
    }
}

// main class
public class MealPlanGenerator {

    // generic method to generate meal
    static <T extends MealPlan> void generate(T m) {
        m.make(); // invoking make() on generic type
    }

    public static void main(String[] args) {

        // created veg meal
        Meal<VegMeal> m = new Meal<>(new VegMeal()); // creating Meal object with VegMeal
        m.serve(); // serving veg meal

        // generating keto meal
        generate(new KetoMeal()); // calling generic method with KetoMeal
    }
}