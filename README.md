<h1>BLink for Behang</h1>
<h2>1: Getting Started</h2>
<p>BLink is a very fast and easy way for you to get your wallpapers published on the Google Play Store!</p>
<p>To get started, create a new Android Application Project using your prefered IDE (IntelliJ, Eclipse, Android Studio, etc.)</p>
<ul>
    <li><p>When creating, there is no need for a "Default Activity". Many IDE's create this by default (because you usually want that when starting a new Android project). So, if you are given the option to, do not create a default activity.</p></li>
</ul>
<h2>2: Setting Up BLink</h2>
<p>Once your project is created, navigate to your <b>"src"</b> directory and in it, you should find a child directory with your package name (if you are following the example, it is "com.behang.BehangBlinkExtension").</p>

<p>Download: <a href="https://www.dropbox.com/s/v3bkvwc58iz06bm/BLinkExtension.java">BLinkExtension.java</a> and place it in your package's directory</p>
<a href="http://imgur.com/Aqdz3vl"><img src="http://i.imgur.com/Aqdz3vl.png" /></a>
<p>Create a new java class that extends BLinkExtension</p>
<p>Below is the code for my Behang BLink extension.</p>
<a href="http://imgur.com/YrJcKAw"><img src="http://i.imgur.com/YrJcKAw.png" /></a>
<p>A generic BLink Extension</p>
<a href="http://imgur.com/zql89gY"><img src="http://i.imgur.com/zql89gY.png" /></a>

<p>That is all the *code* that is needed! Now time for the manifest!</p>
<h2>3: Android Manifest</h2>
<p>In order for Behang to pick up your extension, we have to add a few pieces of data to the Android Manifest.</p>
<p>Below is the code for my Behang BLink extension</p>
<a href="http://imgur.com/BGDFkCb"><img src="http://i.imgur.com/BGDFkCb.png" /></a>
<p>A generic BLink extension</p>
<a href="http://imgur.com/zAHKBST"><img src="http://i.imgur.com/zAHKBST.png"/></a>

<p>An explanation of those lines...</p>
<ul>
    <li>uses-sdk android:minSdkVersion="7"  (Behang supports android 2.1 and up)</li>
    <li>android:exported="true"  (This allows other applications, like Behang, to read your extensions data)
    <li>intent-filter and action  (A custom intent so Behang can find your extension)</li>
    <li>meta-data "json"  (A link to your cloud based JSON file. You may use a string resource for this, or just hardcode)</li>
    <li>meta-data "name"  (The name you want displayed in Behang's BLink Sources)</li>
</ul>

<h2>Deploying your BLink Extension</h2>
<p>When deploying (installing the apk) your extension there is no need to "Launch a Default Activity". Behang simply reads the meta-data of your apk. The package merely needs to be installed.
<p>Once installed, open Behang and select your source from the BLink Source drawer on the right. Behang will load your walls (if you followed the JSON formatting instructions) and display them in Behang.</p>
<a href="http://imgur.com/YRbjz7s"><img src="http://i.imgur.com/YRbjz7s.png" /></a>

<h2>Final Thoughts</h2>
<p>If you followed the previous steps, your extension is ready to be published! Remember, all of the code needed to create an extension is available to you above in the BLinkExtension example. The purpose of this API is to make your life as a designer easier. If, in any way, this is not fulfilling that mission please let us know.</p>
<h2>Enjoy BLink!</h2>
