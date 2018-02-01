package edu.cnm.deepdive.imagessearch.API;

import android.content.Context;
import edu.cnm.deepdive.imagessearch.API.models.SearchResponse;
import edu.cnm.deepdive.imagessearch.R;
import rx.Single;

public class GoogleClient {

  public static Single<SearchResponse> imageSearch(Context context,
      String query) {
    return API.googleService.imageSearch(
        context.getString(R.string.google_api_key),
        context.getString(R.string.search_id),
        query,
        10,
        1
    );
  }

}

