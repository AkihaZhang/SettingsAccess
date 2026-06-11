# SettingsAccess

有些 Android 设备隐藏了系统自带的“设置”入口。安装本应用后，应用列表中会出现一个新的“设置”图标，点击即可尝试打开原生 Android 设置。

## 下载

前往 [Releases](https://github.com/AkihaZhang/SettingsAccess/releases/latest)，下载 `SettingsAccess-v1.0.apk`。

这是一个通用 APK，不需要根据处理器型号选择版本。

## 使用方法

1. 下载并安装 APK。
2. 在桌面或应用列表中找到“设置”。
3. 点击图标，进入设备原生的 Android 设置。

本应用只负责打开系统设置，启动后不会显示自己的界面。

## 适用设备

- 厂商隐藏了原生 Android 设置入口的手机、平板、阅读器或其他 Android 设备
- Android 6.0 及以上版本

如果厂商已经删除、停用或限制了系统设置组件，本应用也可能无法打开它。

## 隐私

- 不申请任何权限
- 不连接网络
- 不包含广告
- 不收集或保存任何数据

## 开发

项目使用 Kotlin 和 Android Framework，包名为 `app.settings.access`。

```sh
./gradlew lint assembleDebug assembleRelease
```

GitHub Actions 会自动检查并构建可安装的 Debug APK。正式发布的 Release APK 需要使用私有密钥签名。
