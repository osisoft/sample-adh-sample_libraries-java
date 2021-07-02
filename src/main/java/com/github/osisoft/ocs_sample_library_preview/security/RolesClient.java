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

    public String TenantAdministratorRoleTypeId = "2dc742ab-39ea-4fc0-a39e-2bcb71c26a5f";
    public String TenantContributorRoleTypeId = "f1439595-e5a2-487f-8a4f-0627fefe75df";
    public String TenantDataStewardRoleTypeId = "45b66433-5f57-420b-bbdf-8bbd60c1cd9d";
    public String TenantMemberRoleTypeId = "7ad2b9ef-5386-4ead-ac9f-ad99c5c5b977";
    public String TenantViewerRoleTypeId = "e6cbf91e-0be8-4858-92b5-f88ecafd5574";
    
    public String CommunityAdministratorRoleTypeId = "b50b3349-fa9e-4a03-9220-cf99184b4645";
    public String CommunityModeratorRoleTypeId = "f49f69a6-61b2-423e-8ad5-d58841be441c";
    public String CommunityMemberRoleTypeId = "f79a55da-7c76-4600-a809-0f62ca9971d9";

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