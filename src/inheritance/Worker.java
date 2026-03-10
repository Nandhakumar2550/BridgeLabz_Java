package inheritance;
    interface Workers {

        void performDuties();
    }

    class Persons {

        String name;
        int id;
    }

    class Chef extends Person implements Workers {

        public void performDuties() {
            System.out.println(name + " cooks food");
        }
    }

    class Waiter extends Person implements Workers {

        public void performDuties() {
            System.out.println(name + " serves customers");
        }
    }
    class Worker{
        public static void main(String args[]){

        }

    }
