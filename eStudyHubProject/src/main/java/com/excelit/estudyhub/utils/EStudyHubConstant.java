package com.excelit.estudyhub.utils;

public class EStudyHubConstant {
	/**
	 * HTTP STATUS CODES OF SUCCESS
	 */
	/* The request is OK */
	public static String OK = "200";
	/* The request is OK */
	public static String SUCCESS = "200";
	/* The request is complete, and a new resource is created */
	public static String CREATED = "201";
	/*
	 * The request is accepted for processing, but the processing is not
	 * complete.
	 */
	public static String ACCEPTED = "202";

	public static String NON_AUTHORITATIVE_INFORMATION = "203";

	public static String NO_CONTENT = "204";

	public static String RESET_CONTENT = "205";

	/**
	 * HTTP STATUS CODES OF CLIENT ERROR
	 */
	/* The server did not understand the request */
	public static final String BAD_REQUEST = "400";
	/* The requested page needs a username and a password */
	public static final String UN_AUTHORIZED = "401";
	/* You can not use this code yet */
	public static final String PAYMENT_REQUIRED = "402";
	/* Access is forbidden to the requested page */
	public static final String FOR_BIDDEN = "403";
	/* The server can not find the requested page. */
	public static final String NOT_FOUND = "404";
	/* The method specified in the request is not allowed. */
	public static final String METHOD_NOT_ALLOWED = "405";
	/*
	 * The server can only generate a response that is not accepted by the
	 * client.
	 */
	public static final String NOT_ACCEPTABLE = "406";

	/**
	 * HTTP STATUS CODES OF SERVER ERROR
	 */
	/* The request was not completed. The server met an unexpected condition */
	public static final String INTERNAL_SERVER_ERROR = "500";
	/*
	 * The request was not completed. The server did not support the
	 * functionality required.
	 */
	public static final String NOT_IMPLEMENTED = "501";
	/*
	 * The request was not completed. The server received an invalid response
	 * from the upstream server
	 */
	public static final String BAD_GATEWAY = "502";
	/*
	 * The request was not completed. The server is temporarily overloading or
	 * down
	 */
	public static final String SERVICE_UNAVAILABLE = "503";
	/* The gateway has timed out. */
	public static final String GATEWAY_TIMEOUT = "504";
	/* The server does not support the "http protocol" version. */
	public static final String HTTP_VERSION_NOT_SUPPORTED = "505";

	public static final String SUCCESSMSG = "transaction saved successfully";
	public static final String SUCCESSMSGFORDATASAVING = "data saved successfully";
	public static final String SUCCESSMSGFORDATAMODIFICATION = "data modified successfully";
	public static final String STANDING_INSTRUCTION_CANCELLATION = "Standing Instruction Cancelled Successfully";
	public static final String NO_DATA = "No Data Found";
	public static final String DATA_NOT_SAVED = "data Not Saved";

}
