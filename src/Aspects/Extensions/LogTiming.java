 package Aspects.Extensions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import Aspects.LoggerTiming;

import framework.aop.annotations.*;

@Target(ElementType.METHOD)
@Extension(aspect=LoggerTiming.class, adviceType=AdviceType.Around)
public @interface LogTiming {
}
