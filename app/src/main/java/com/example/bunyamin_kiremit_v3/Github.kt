package com.example.bunyamin_kiremit_v3

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class Github : AppCompatActivity() {

    lateinit var githubWebView:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)

        githubWebView=findViewById(R.id.githubWebView)

        val url="https://github.com/BunyaminKiremit"
        githubWebView.settings.javaScriptEnabled=true
        githubWebView.webViewClient=customWebViewClient()
        githubWebView.loadUrl(url)

    }
    class customWebViewClient: WebViewClient(){
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            Log.d("shouldOverrideUrlLoading","Loading")
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            Log.d("shouldOverrideUrlLoading","Finish")
            super.onPageFinished(view, url)
        }

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            Log.d("shouldOverrideUrlLoading","Start")
            super.onPageStarted(view, url, favicon)
        }

    }

}