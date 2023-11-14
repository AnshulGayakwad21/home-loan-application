package com.hla.in.homeloanapplication.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	private String desc="Description";
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request){
				
		Map<String, String> map = new HashMap<>();
		
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldName = ((FieldError)error).getField();
			String msg = error.getDefaultMessage();
			
			map.put(fieldName, msg);
		});
		
		return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
	}


////////////////////////////////////////////////////////////////////////////////
	//    @ExceptionHandler(EmployeeNotFoundException.class)
	//    public ResponseEntity<String> handleEmployeeNotFoundException(EmployeeNotFoundException enfe){
	//        return new ResponseEntity<String>(enfe.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	//    }
///////////////////////////////////////////////////////////////////////////////




	    @ExceptionHandler(AdminApprovalException.class)
	    public ResponseEntity<String> handleEmployeeNotFoundException(AdminApprovalException ex){
	        return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	    }
//	@ExceptionHandler(AdminApprovalException.class)
//	public ResponseEntity<String> handleAdminApprovalException(AdminApprovalException ex) {
//		HttpHeaders header = new HttpHeaders();
//		header.add(desc, "Trying to get Admin Approval");
//
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
//
//


	    @ExceptionHandler(CustomerNotFoundException.class)
	    public ResponseEntity<String> handleEmployeeNotFoundException(CustomerNotFoundException ex){
	        return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	    }
//	@ExceptionHandler(CustomerNotFoundException.class)
//	public ResponseEntity<String> handleCustomerException(CustomerNotFoundException ex) {
//		HttpHeaders header = new HttpHeaders();
//		header.add(desc, "Trying to get a customer");
//
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
//
//	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	    @ExceptionHandler(FinanceVerificationException.class)
	    public ResponseEntity<String> handleEmployeeNotFoundException(FinanceVerificationException ex){
	        return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	    }
//	@ExceptionHandler(FinanceVerificationException.class)
//	public ResponseEntity<String> handleFinanceException(FinanceVerificationException ex) {
//		HttpHeaders header = new HttpHeaders();
//		header.add(desc, "Trying to get a Finance Verification Officer");
//
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
//
//	}
	//////////////////////////////////////////////////////////////////////////////////////////




	    @ExceptionHandler(InvalidCredentialException.class)
	    public ResponseEntity<String> handleEmployeeNotFoundException(InvalidCredentialException ex){
	        return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	    }
//	@ExceptionHandler(InvalidCredentialException.class)
//	public ResponseEntity<String> handleInvalidCredentialException(InvalidCredentialException ex) {
//		HttpHeaders header = new HttpHeaders();
//		header.add(desc, "Trying to get Credentials");
//
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
//
//	}
	/////////////////////////////////////////////////////////////////////////////////////////////////


	    @ExceptionHandler(InvalidLoanApplicationException.class)
	    public ResponseEntity<String> handleEmployeeNotFoundException(InvalidLoanApplicationException ex){
	        return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	    }
//	@ExceptionHandler(InvalidLoanApplicationException.class)
//	public ResponseEntity<String> handleInvalidLoanApplicationException(InvalidLoanApplicationException ex) {
//		HttpHeaders header = new HttpHeaders();
//		header.add(desc, "Trying to get Loan Application");
//
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
//
//	}
	///////////////////////////////////////////////////////////////////////////////////////////////////




	    @ExceptionHandler(InvalidLoanAgreementException.class)
	    public ResponseEntity<String> handleEmployeeNotFoundException(InvalidLoanAgreementException ex){
	        return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	    }

//	@ExceptionHandler(InvalidLoanAgreementException.class)
//	public ResponseEntity<String> handleInvalidLoanAgrementException(InvalidLoanAgreementException ex) {
//		HttpHeaders header = new HttpHeaders();
//		header.add(desc, "Trying to get Loan Agreement");
//
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
//
//	}
	//////////////////////////////////////////////////////////////////////////////////////////////////


	    @ExceptionHandler(LandVerificationException.class)
	    public ResponseEntity<String> handleEmployeeNotFoundException(LandVerificationException ex){
	        return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	    }

//	@ExceptionHandler(LandVerificationException.class)
//	public ResponseEntity<String> handleLandException(LandVerificationException ex) {
//		HttpHeaders header = new HttpHeaders();
//		header.add(desc, "Trying to get a Land Verification Officer");
//
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).build();
//
//	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////



	    @ExceptionHandler(CouldNotBeAddedException.class)
	    public ResponseEntity<String> handleEmployeeNotFoundException(CouldNotBeAddedException ex){
	        return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	    }

	    @ExceptionHandler(ResourceNotFoundException.class)
	    public ResponseEntity<String> handleEmployeeNotFoundException(ResourceNotFoundException ex){
	        return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	    }

}
