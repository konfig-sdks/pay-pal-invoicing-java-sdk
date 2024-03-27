package com.konfigthis.client;

import com.konfigthis.client.api.InvoicesApi;
import com.konfigthis.client.api.SearchInvoicesApi;
import com.konfigthis.client.api.TemplatesApi;

public class PayPalInvoicing {
    private ApiClient apiClient;
    public final InvoicesApi invoices;
    public final SearchInvoicesApi searchInvoices;
    public final TemplatesApi templates;

    public PayPalInvoicing() {
        this(null);
    }

    public PayPalInvoicing(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.invoices = new InvoicesApi(this.apiClient);
        this.searchInvoices = new SearchInvoicesApi(this.apiClient);
        this.templates = new TemplatesApi(this.apiClient);
    }

}
