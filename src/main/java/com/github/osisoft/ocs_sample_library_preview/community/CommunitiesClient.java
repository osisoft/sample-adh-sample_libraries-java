package com.github.osisoft.ocs_sample_library_preview.community;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.github.osisoft.ocs_sample_library_preview.BaseClient;
import com.github.osisoft.ocs_sample_library_preview.SdsError;

public class CommunitiesClient {
    private String baseUrl = null;
    private String apiVersion = null;
    private Gson mGson = null;
    private BaseClient baseClient;
    // REST API url strings
    // base of all requests
    private String requestBase = "api/{apiVersion}-preview";
    private String searchBase = requestBase + "/Search/Communities/{communityId}/Streams?query={query}";

    public CommunitiesClient(BaseClient base) {
        baseClient = base;
        this.baseUrl = base.baseUrl;
        this.apiVersion = base.apiVersion;
        this.mGson = base.mGson;
    }

    public ArrayList<StreamSearchResult> getCommunityStreams(String communityId, String query) throws SdsError {
        URL url;
        HttpURLConnection urlConnection = null;
        String response = "";

        try {
            url = new URL(baseUrl + searchBase.replace("{apiVersion}", apiVersion)
              .replace("{communityId}", communityId).replace("{query}", query));
            urlConnection = baseClient.getConnection(url, "GET");

            int httpResponse = urlConnection.getResponseCode();
            if (httpResponse == HttpURLConnection.HTTP_OK) {
            } else {
                throw new SdsError(urlConnection, "get community streams request failed");
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
        
        ArrayList<StreamSearchResult> results = mGson.fromJson(response, new TypeToken<ArrayList<StreamSearchResult>>() {
        }.getType());
        return results;

    }
}