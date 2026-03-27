package generics;

// interface for meal plan
interface MealPlan {
    void make();
}

// veg meal class
class VegMeal implements MealPlan {
    public void make() {
        System.out.println("Veg Meal");
    }
}

// keto meal class
class KetoMeal implements MealPlan {
    public void make() {
        System.out.println("Keto Meal");
    }
}

// generic class to handle meals
class Meal<T extends MealPlan> {
    T meal;

    // constructor
    Meal(T meal) {
        this.meal = meal;
    }

    // serving meal
    void serve() {
        meal.make();
    }
}

// main class
public class MealPlanGenerator {

    // generic method to generate meal
    static <T extends MealPlan> void generate(T m) {
        m.make();
    }

    public static void main(String[] args) {

        // created veg meal
        Meal<VegMeal> m = new Meal<>(new VegMeal());
        m.serve();

        // generating keto meal
        generate(new KetoMeal());
    }
}
