package ly.img.cesdk.matrix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ly.img.cesdk.matrix.ui.theme.CESDKMatrixTheme
import ly.img.editor.DesignEditor
import ly.img.editor.EngineConfiguration
import ly.img.editor.core.UnstableEditorApi
import ly.img.editor.rememberForDesign

class MainActivity : ComponentActivity() {
    @OptIn(UnstableEditorApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CESDKMatrixTheme {
                val engineConfiguration = EngineConfiguration.rememberForDesign()
                DesignEditor(
                    engineConfiguration = engineConfiguration
                ) {
                    finish()
                }
            }
        }
    }
}