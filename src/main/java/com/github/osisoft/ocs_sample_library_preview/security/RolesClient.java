package com.github.osisoft.ocs_sample_library_preview.security;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.github.osisoft.ocs_sample_library_preview.BaseClient;
import com.github.osisoft.ocs_sample_library_preview.SdsError;

public class RolesClient {
    private String baseUrl = null;
    private String apiVersion = null;
    private Gson mGson = null;
    private BaseClient baseClient;
    // REST API url strings
    // base of all requests
    private String requestBase = "api/{apiVersion}/Tenants/{tenantId}";
    private String rolesBase = requestBase + "/Roles";

    public String CommunityMember = "f79a55da-7c76-4600-a809-0f62ca9971d9";

    public RolesClient(BaseClient base) {
        baseClient = base;
        this.baseUrl = base.baseUrl;
        this.apiVersion = base.apiVersion;
        this.mGson = base.mGson;
    }

    public ArrayList<Role> getRoles(String tenantId) throws SdsError {
        URL url;
        HttpURLConnection urlConnection = null;
        String response = "";

        try {
            url = new URL(baseUrl + rolesBase.replace("{apiVersion}", apiVersion).replace("{tenantId}", tenantId));
            urlConnection = baseClient.getConnection(url, "GET");

            int httpResponse = urlConnection.getResponseCode();
            if (httpResponse == HttpURLConnection.HTTP_OK) {
            } else {
                throw new SdsError(urlConnection, "get roles request failed");
            }

            response = baseClient.getResponse(urlConnection);
        } catch (SdsError sdsError) {
            sdsError.print();
            throw sdsError;
        } catch (MalformedURLException mal) {
            System.out.println("MalformedURLException");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        ArrayList<Role> results = mGson.fromJson(response, new TypeToken<ArrayList<Role>>() {
        }.getType());
        return results;

    }
}