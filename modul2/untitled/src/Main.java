abstract class Product {
    abstract String getName();
    /**
     * Function to get all of information about product
     */
    public void getProductInfo() {
// some magic code
    }
}

abstract class FoodProduct extends Product {
    abstract Date getExpiredDate();
}

class Vegetable extends FoodProduct {
    @Override
    String getName() {
        return "Broccoli";
    }
    @Override
    Date getExpiredDate() {
        return new Date();
    }
}

class Smartphone extends Product {
    @Override
    String getName() {
        return "Samsung S10+ Limited Edition";
    }
}