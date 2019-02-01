package org.redcabbage.licenses.model;

public class License {
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public License withLicenseId(String licenseId) {
        setLicenseId(licenseId);
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public License withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public License withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    public String getOrganisationId() {
        return organisationId;
    }
              
    public void setOrganisationId(String organisationId) {
        this.organisationId = organisationId;
    }

    public License withOrganisationId(String organisationId) {
        setOrganisationId(organisationId);
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public License withId(String id) {
        setId(id);
        return this;
    }

    private String id;
    private String licenseId;
    private String productName;
    private String licenseType;
    private String organisationId;
}
