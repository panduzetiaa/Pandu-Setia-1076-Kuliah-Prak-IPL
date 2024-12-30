public class CustomerValidation {

    public static void main(String[] args) {
        // Membuat objek CustomerInquiryRequest contoh
        CustomerInquiryRequest request = new CustomerInquiryRequest();
        request.Customer = new Customer();
        request.CustomerProduct = new CustomerProduct();

        // Menetapkan nilai contoh
        request.Customer.CustomerID = "123456";
        request.CustomerProduct.ProductNumber = "654321";

        // Menjalankan validasi
        try {
            boolean result = ValidateRequest(request, 10, 10);
            System.out.println("Validation result: " + result);
        } catch (BusinessException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }

    private static boolean ValidateRequest(CustomerInquiryRequest request, int customerIDFieldLength, int productFieldLength) {
        if (request.CustomerProduct.ProductNumber != null && request.Customer.CustomerID != null) {
            if (!request.CustomerProduct.ProductNumber.equals("") && !request.Customer.CustomerID.equals("")) {
                throw new BusinessException(HandledErrors.InvalidBothParameterMessage);
            } else if (request.Customer.CustomerID.equals("") && request.CustomerProduct.ProductNumber.equals("")) {
                throw new BusinessException(HandledErrors.CustomerEmptyMessage);
            } else if (!request.Customer.CustomerID.equals("")) {
                if (request.Customer.CustomerID.length() > customerIDFieldLength) {
                    throw new BusinessException(HandledErrors.CustomerInvalidLengthMessage);
                }
            } else {
                if (request.CustomerProduct.ProductNumber.length() > productFieldLength) {
                    throw new BusinessException(HandledErrors.ProductInvalidLengthMessage);
                }
            }
        } else if (request.CustomerProduct.ProductNumber == null && request.Customer.CustomerID == null) {
            throw new BusinessException(HandledErrors.CustomerEmptyMessage);
        } else if (request.CustomerProduct.ProductNumber == null) {
            if (request.Customer.CustomerID.length() > customerIDFieldLength) {
                throw new BusinessException(HandledErrors.CustomerInvalidLengthMessage);
            }
        } else {
            if (request.CustomerProduct.ProductNumber.length() > productFieldLength) {
                throw new BusinessException(HandledErrors.ProductInvalidLengthMessage);
            }
        }
        if (request.Customer.CustomerID != null) {
            request.Customer.CustomerID = String.format("%1$" + customerIDFieldLength + "s", request.Customer.CustomerID).replace(' ', '0');
        }
        if (request.CustomerProduct.ProductNumber != null) {
            request.CustomerProduct.ProductNumber = String.format("%1$" + productFieldLength + "s", request.CustomerProduct.ProductNumber).replace(' ', '0');
        }
        return true;
    }
}

class CustomerInquiryRequest {
    Customer Customer;
    CustomerProduct CustomerProduct;
}

class Customer {
    String CustomerID;
}

class CustomerProduct {
    String ProductNumber;
}

class BusinessException extends RuntimeException {
    BusinessException(String message) {
        super(message);
    }
}

class HandledErrors {
    static final String InvalidBothParameterMessage = "Both CustomerID and ProductNumber cannot be populated.";
    static final String CustomerEmptyMessage = "CustomerID and ProductNumber cannot both be empty.";
    static final String CustomerInvalidLengthMessage = "CustomerID length is invalid.";
    static final String ProductInvalidLengthMessage = "ProductNumber length is invalid.";
}
