package com.example.mayakov.audiotracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AudioMetadataReceiver extends BroadcastReceiver {

    static final class MetadataChangedPlayer {
        static final String SPOTIFY = "com.spotify.music.metadatachanged";
        static final String PLAY_MUSIC = "com.android.music.metachanged";
        static final String RDIO = "com.rdio.android.metachanged";
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        String  artist = intent.getStringExtra("artist");
        String  album = intent.getStringExtra("album");
        String  track = intent.getStringExtra("track");

        Log.i("METADATA", "ACTION: " + action);

        Log.i("METADATA", "artist: " + artist);
        Log.i("METADATA", "album: " + album);
        Log.i("METADATA", "track: " + track);

        if (action.equals(MetadataChangedPlayer.SPOTIFY)) {

            String id = intent.getStringExtra("id");
            Integer length = intent.getIntExtra("length", 1);
            Long timeSent = intent.getLongExtra("timeSent", 1L);

            Log.i("METADATA", "id: " + id);
            Log.i("METADATA", "length: " + Integer.toString(length));
            Log.i("METADATA", "timeSent: " + Long.toString(timeSent));

        } else if (action.equals(MetadataChangedPlayer.PLAY_MUSIC)) {

            Long    albumId = intent.getLongExtra("albumId", 1L);
            Boolean albumArtFromService = intent.getBooleanExtra("albumArtFromService", false);
            Long    id = intent.getLongExtra("id", 1L);
            Long    duration = intent.getLongExtra("duration", 1L);
            String  currentContainerName = intent.getStringExtra("currentContainerName");
            Integer domain = intent.getIntExtra("domain", 1);
            Boolean currentSongLoaded = intent.getBooleanExtra("currentSongLoaded", false);
            Boolean preparing = intent.getBooleanExtra("preparing", false);
            Integer rating = intent.getIntExtra("rating", 1);
            Integer currentContainerTypeValue = intent.getIntExtra("currentContainerTypeValue", 1);
            Long    currentContainerId = intent.getLongExtra("currentContainerId", 1L);
            Boolean playing = intent.getBooleanExtra("preparing", true);
            Boolean streaming = intent.getBooleanExtra("streaming", false);
            Boolean inErrorState = intent.getBooleanExtra("inErrorState", false);
            String  currentContainerExtData = intent.getStringExtra("currentContainerExtData");
            Boolean local = intent.getBooleanExtra("local", true);
            String  videoId = intent.getStringExtra("videoId");
            Long    position = intent.getLongExtra("position", 1L);
            String  currentContainerExtId = intent.getStringExtra("currentContainerExtId");
            String  videoThumbnailUrl = intent.getStringExtra("videoThumbnailUrl");
            Boolean supportsRating = intent.getBooleanExtra("supportsRating", true);
            Long    ListSize = intent.getLongExtra("ListSize", 1L);
            Integer previewPlayType = intent.getIntExtra("previewPlayType", 1);
            Long    ListPosition = intent.getLongExtra("ListPosition", 1L);

            Log.i("METADATA", "albumId: " + Long.toString(albumId));
            Log.i("METADATA", "albumArtFromService: " + Boolean.toString(albumArtFromService));
            Log.i("METADATA", "id: " + Long.toString(id));
            Log.i("METADATA", "duration: " + Long.toString(duration));
            Log.i("METADATA", "currentContainerName: " + currentContainerName);
            Log.i("METADATA", "domain: " + Integer.toString(domain));
            Log.i("METADATA", "currentSongLoaded: " + Boolean.toString(currentSongLoaded));
            Log.i("METADATA", "preparing: " + Boolean.toString(preparing));
            Log.i("METADATA", "rating: " + Integer.toString(rating));
            Log.i("METADATA", "currentContainerTypeValue: " + Integer.toString(currentContainerTypeValue));
            Log.i("METADATA", "currentContainerId: " + Long.toString(currentContainerId));
            Log.i("METADATA", "playing: " + Boolean.toString(playing));
            Log.i("METADATA", "streaming: " + Boolean.toString(streaming));
            Log.i("METADATA", "inErrorState: " + Boolean.toString(inErrorState));
            Log.i("METADATA", "currentContainerExtData: " + currentContainerExtData);
            Log.i("METADATA", "local: " + Boolean.toString(local));
            Log.i("METADATA", "videoId: " + videoId);
            Log.i("METADATA", "position: " + Long.toString(position));
            Log.i("METADATA", "currentContainerExtId: " + currentContainerExtId);
            Log.i("METADATA", "videoThumbnailUrl: " + videoThumbnailUrl);
            Log.i("METADATA", "supportsRating: " + Boolean.toString(supportsRating));
            Log.i("METADATA", "ListSize: " + Long.toString(ListSize));
            Log.i("METADATA", "previewPlayType: " + Integer.toString(previewPlayType));
            Log.i("METADATA", "ListPosition: " + Long.toString(ListPosition));

        } else if ( action.equals(MetadataChangedPlayer.RDIO) ) {

            Boolean isPlaying = intent.getBooleanExtra("isPlaying", true);
            Boolean isPaused = intent.getBooleanExtra("isPaused", false);
            Double  duration = intent.getDoubleExtra("duration", 2.5);
            Double  position = intent.getDoubleExtra("position", 2.5);
            String  rdioSourceKey = intent.getStringExtra("rdioSourceKey");
            String  rdioTrackKey = intent.getStringExtra("rdioSourceKey");
            String  albumArtist = intent.getStringExtra("rdioSourceKey");

            Log.i("METADATA", "isPlaying: " + Boolean.toString(isPlaying));
            Log.i("METADATA", "isPaused: " + Boolean.toString(isPaused));
            Log.i("METADATA", "duration: " + Double.toString(duration));
            Log.i("METADATA", "position: " + Double.toString(position));
            Log.i("METADATA", "rdioSourceKey: " + rdioSourceKey);
            Log.i("METADATA", "rdioTrackKey: " + rdioTrackKey);
            Log.i("METADATA", "albumArtist: " + albumArtist);

        }
    }
}
