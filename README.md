# SettingsAccess

为隐藏了原生 Android 设置入口的设备提供一个简单的“设置”启动图标。

## 功能

- 应用名称跟随系统语言显示为“设置”或“Settings”
- 优先通过 Android 标准设置 Action 打开系统设置
- 标准入口不可用时，回退到系统设置应用的 Launcher Activity
- 无可见界面、无网络访问、无权限请求、无数据收集
- 单一通用 APK，不按 CPU 架构拆包

## 应用信息

- 包名：`app.settings.access`
- 最低版本：Android 6.0（API 23）
- 目标版本：Android 15（API 35）

应用不包含原生 `.so` 库，因此同一个 APK 可直接用于常见 Android
设备，无需选择单独的 ABI 版本。

## 构建

需要 JDK 17 和 Android SDK 35：

```sh
./gradlew lint assembleDebug assembleRelease
```

可安装的 Debug APK 位于：

```text
app/build/outputs/apk/debug/app-debug.apk
```

Release APK 需要使用自己的私有密钥签名。签名密钥不应提交到仓库。

## 下载

已签名版本可从 [Releases](https://github.com/AkihaZhang/SettingsAccess/releases)
下载。
