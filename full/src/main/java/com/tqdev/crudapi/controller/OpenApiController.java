package com.tqdev.crudapi.controller;

import com.tqdev.crudapi.data.DataService;
import com.tqdev.crudapi.meta.MetaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openapi")
public class OpenApiController extends BaseController {

	public static final Logger logger = LoggerFactory.getLogger(OpenApiController.class);

	@Autowired
	MetaService metaService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<?> openapi() {
		logger.info("Requesting openapi meta data");
		return success(metaService.getOpenApiDefinition());
	}
}