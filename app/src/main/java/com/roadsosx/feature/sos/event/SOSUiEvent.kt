package com.roadsosx.feature.sos.event

sealed interface SOSUiEvent {
    object TriggerSOS : SOSUiEvent
    object ResolveSOS : SOSUiEvent
}
