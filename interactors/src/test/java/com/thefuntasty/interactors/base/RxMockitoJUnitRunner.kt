package com.thefuntasty.interactors.base

import com.thefuntasty.interactors.RxSchedulerRule
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(value = MockitoJUnitRunner::class)
abstract class RxMockitoJUnitRunner {
    @get:Rule var rxJavaRule = RxSchedulerRule()
}
