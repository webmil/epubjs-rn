package com.epubreader;

import android.app.Application;

import com.facebook.react.ReactApplication;
import org.wonday.orientation.OrientationPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.rnziparchive.RNZipArchivePackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.futurepress.staticserver.FPStaticServerPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import android.webkit.WebView;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new OrientationPackage(),
            new RNFetchBlobPackage(),
            new RNZipArchivePackage(),
            new RNCWebViewPackage(),
            new FPStaticServerPackage(),
            new VectorIconsPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
    WebView.setWebContentsDebuggingEnabled(true);
  }
}
