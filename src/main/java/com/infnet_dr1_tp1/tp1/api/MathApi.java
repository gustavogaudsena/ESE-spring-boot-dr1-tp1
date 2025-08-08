package com.infnet_dr1_tp1.tp1.api;

import com.infnet_dr1_tp1.tp1.facade.MathFacade;
import com.infnet_dr1_tp1.tp1.models.MathResult;
import com.infnet_dr1_tp1.tp1.models.OperationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
public class MathApi {

    @Autowired
    private MathFacade mathFacade;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public MathResult getAdd(@RequestParam double n1, @RequestParam double n2) {
        return mathFacade.add(n1, n2);
    }


    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    public MathResult getSubtract(@RequestParam double n1, @RequestParam double n2) {
        return mathFacade.subtract(n1, n2);
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public MathResult getMultiply(@RequestParam double n1, @RequestParam double n2) {
        return mathFacade.multiply(n1, n2);
    }


    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public MathResult getDivide(@RequestParam double n1, @RequestParam double n2) {
        return mathFacade.divide(n1, n2);
    }

    @RequestMapping(value = "/exponentiate", method = RequestMethod.GET)
    public MathResult getExponentiate(@RequestParam double base, @RequestParam double exponent) {
        return mathFacade.exponentiate(base, exponent);
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public MathResult postAdd(@RequestBody OperationRequest operationRequest) {
        return mathFacade.add(operationRequest.getN1(), operationRequest.getN2());
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    public MathResult postSubtract(@RequestBody OperationRequest operationRequest) {
        return mathFacade.subtract(operationRequest.getN1(), operationRequest.getN2());
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    public MathResult postMultiply(@RequestBody OperationRequest operationRequest) {
        return mathFacade.multiply(operationRequest.getN1(), operationRequest.getN2());
    }

    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    public MathResult postDivide(@RequestBody OperationRequest operationRequest) {
        return mathFacade.divide(operationRequest.getN1(), operationRequest.getN2());
    }

    @RequestMapping(value = "/exponentiate", method = RequestMethod.POST)
    public MathResult postExponentiate(@RequestBody OperationRequest operationRequest) {
        return mathFacade.exponentiate(operationRequest.getBase(), operationRequest.getExponent());
    }
}
