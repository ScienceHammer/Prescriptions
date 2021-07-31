package app.core.services;

import javax.transaction.Transactional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Scope("prototype")
public class PatientService {

}
