package com.roadsosx.core.designsystem.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.roadsosx.core.designsystem.color.DarkBackground
import com.roadsosx.core.designsystem.color.DarkOnBackground
import com.roadsosx.core.designsystem.color.DarkOnPrimary
import com.roadsosx.core.designsystem.color.DarkOnPrimaryContainer
import com.roadsosx.core.designsystem.color.DarkOnSecondary
import com.roadsosx.core.designsystem.color.DarkOnSurface
import com.roadsosx.core.designsystem.color.DarkPrimary
import com.roadsosx.core.designsystem.color.DarkPrimaryContainer
import com.roadsosx.core.designsystem.color.DarkSecondary
import com.roadsosx.core.designsystem.color.DarkSurface
import com.roadsosx.core.designsystem.color.LightBackground
import com.roadsosx.core.designsystem.color.LightOnBackground
import com.roadsosx.core.designsystem.color.LightOnPrimary
import com.roadsosx.core.designsystem.color.LightOnPrimaryContainer
import com.roadsosx.core.designsystem.color.LightOnSecondary
import com.roadsosx.core.designsystem.color.LightOnSurface
import com.roadsosx.core.designsystem.color.LightPrimary
import com.roadsosx.core.designsystem.color.LightPrimaryContainer
import com.roadsosx.core.designsystem.color.LightSecondary
import com.roadsosx.core.designsystem.color.LightSurface
import com.roadsosx.core.designsystem.typography.Typography

private val DarkColorScheme = darkColorScheme(
    primary = DarkPrimary,
    onPrimary = DarkOnPrimary,
    primaryContainer = DarkPrimaryContainer,
    onPrimaryContainer = DarkOnPrimaryContainer,
    secondary = DarkSecondary,
    onSecondary = DarkOnSecondary,
    background = DarkBackground,
    onBackground = DarkOnBackground,
    surface = DarkSurface,
    onSurface = DarkOnSurface
)

private val LightColorScheme = lightColorScheme(
    primary = LightPrimary,
    onPrimary = LightOnPrimary,
    primaryContainer = LightPrimaryContainer,
    onPrimaryContainer = LightOnPrimaryContainer,
    secondary = LightSecondary,
    onSecondary = LightOnSecondary,
    background = LightBackground,
    onBackground = LightOnBackground,
    surface = LightSurface,
    onSurface = LightOnSurface
)

@Composable
fun RoadSOSXTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
