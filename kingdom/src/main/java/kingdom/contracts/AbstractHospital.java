package kingdom.contracts;

import kingdom.core.KingdomEntity;

public abstract class AbstractHospital implements KingdomEntity {

    /**
     * Admits a patient to the hospital for treatment.
     * @param patientName the name of the patient
     */
    public abstract void admitPatient(String patientName);

    /**
     * Gets the number of patients currently admitted.
     * @return patient count
     */
    public abstract int getPatientCount();

    /**
     * Discharges a patient from the hospital.
     * @param patientName the name of the patient to discharge
     */
    public abstract void dischargePatient(String patientName);
}