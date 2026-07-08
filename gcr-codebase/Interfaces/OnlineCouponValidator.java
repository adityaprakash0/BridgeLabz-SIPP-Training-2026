// Interface with static and abstract methods
interface CouponValidator {
    void validateCoupon(String code);

    // Static method inside interface
    static boolean isLengthValid(String code) {
        return code != null && code.length() >= 5 && code.length() <= 10;
    }
}

// Implementing class
class ShoppingCart implements CouponValidator {
    private String validPrefix = "SAVE";

    @Override
    public void validateCoupon(String code) {
        if (CouponValidator.isLengthValid(code) && code.startsWith(validPrefix)) {
            System.out.println("Coupon '" + code + "' is VALID. Discount applied!");
        } else {
            System.out.println("Coupon '" + code + "' is INVALID.");
        }
    }
}

// Main class
public class OnlineCouponValidator {
    public static void main(String[] args) {
        String[] appliedCoupons = {"SAVE20", "DISC50", "SAVE999999", "SAV", "SAVE50"};
        ShoppingCart cart = new ShoppingCart();

        System.out.println("--- Validating Coupons ---");
        for (String coupon : appliedCoupons) {
            cart.validateCoupon(coupon);
        }
    }
}
