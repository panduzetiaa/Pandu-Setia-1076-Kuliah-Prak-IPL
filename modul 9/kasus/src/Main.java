private boolean ValidateRequest(CustomerInquiryRequest request, int customerIDFieldLength, int productFieldLength) {
    if (request.CustomerProduct.ProductNumber != null && request.Customer.CustomerID != null) {
        if (request.CustomerProduct.ProductNumber != string.Empty && request.Customer.CustomerID != string.Empty) {
            throw new BusinessException(HandledErrors.InvalidBothParameterMessage);
        } else if (request.Customer.CustomerID == string.Empty && request.CustomerProduct.ProductNumber == string.Empty) {
            throw new BusinessException(HandledErrors.CustomerEmptyMessage);
        } else if (request.Customer.CustomerID != "") {
            if (request.Customer.CustomerID.Length > customerIDFieldLength) {
                throw new BusinessException(HandledErrors.CustomerInvalidLengthMessage);
            }
        } else {
            if (request.CustomerProduct.ProductNumber.Length > productFieldLength) {
                throw new BusinessException(HandledErrors.ProductInvalidLengthMessage);
            }
        }
    } else if (request.CustomerProduct.ProductNumber == null && request.Customer.CustomerID == null) {
        throw new BusinessException(HandledErrors.CustomerEmptyMessage);
    } else if (request.CustomerProduct.ProductNumber == null) {
        if (request.Customer.CustomerID.Length > customerIDFieldLength) {
            throw new BusinessException(HandledErrors.CustomerInvalidLengthMessage);
        }
    } else {
        if (request.CustomerProduct.ProductNumber.Length > productFieldLength) {
            throw new BusinessException(HandledErrors.ProductInvalidLengthMessage);
        }
    }
    if (request.Customer.CustomerID != null) {
        request.Customer.CustomerID = request.Customer.CustomerID.PadLeft(customerIDFieldLength, Convert.ToChar("0", CultureInfo.CurrentCulture));
    }
    if (request.CustomerProduct.ProductNumber != null) {
        request.CustomerProduct.ProductNumber = request.CustomerProduct.ProductNumber.PadLeft(productFieldLength, Convert.ToChar("0", CultureInfo.CurrentCulture));
    }
    return true;
}
