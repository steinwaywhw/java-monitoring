/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/service.proto

package com.google.monitoring.v3;

public interface BasicSliOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.BasicSli)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from
   * other methods will not be used to calculate performance for this SLI. If
   * omitted, this SLI applies to all the Service's methods. For service types
   * that don't support breaking down by method, setting this field will result
   * in an error.
   * </pre>
   *
   * <code>repeated string method = 7;</code>
   */
  java.util.List<java.lang.String> getMethodList();
  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from
   * other methods will not be used to calculate performance for this SLI. If
   * omitted, this SLI applies to all the Service's methods. For service types
   * that don't support breaking down by method, setting this field will result
   * in an error.
   * </pre>
   *
   * <code>repeated string method = 7;</code>
   */
  int getMethodCount();
  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from
   * other methods will not be used to calculate performance for this SLI. If
   * omitted, this SLI applies to all the Service's methods. For service types
   * that don't support breaking down by method, setting this field will result
   * in an error.
   * </pre>
   *
   * <code>repeated string method = 7;</code>
   */
  java.lang.String getMethod(int index);
  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from
   * other methods will not be used to calculate performance for this SLI. If
   * omitted, this SLI applies to all the Service's methods. For service types
   * that don't support breaking down by method, setting this field will result
   * in an error.
   * </pre>
   *
   * <code>repeated string method = 7;</code>
   */
  com.google.protobuf.ByteString getMethodBytes(int index);

  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry
   * from other locations will not be used to calculate performance for this
   * SLI. If omitted, this SLI applies to all locations in which the Service has
   * activity. For service types that don't support breaking down by location,
   * setting this field will result in an error.
   * </pre>
   *
   * <code>repeated string location = 8;</code>
   */
  java.util.List<java.lang.String> getLocationList();
  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry
   * from other locations will not be used to calculate performance for this
   * SLI. If omitted, this SLI applies to all locations in which the Service has
   * activity. For service types that don't support breaking down by location,
   * setting this field will result in an error.
   * </pre>
   *
   * <code>repeated string location = 8;</code>
   */
  int getLocationCount();
  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry
   * from other locations will not be used to calculate performance for this
   * SLI. If omitted, this SLI applies to all locations in which the Service has
   * activity. For service types that don't support breaking down by location,
   * setting this field will result in an error.
   * </pre>
   *
   * <code>repeated string location = 8;</code>
   */
  java.lang.String getLocation(int index);
  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry
   * from other locations will not be used to calculate performance for this
   * SLI. If omitted, this SLI applies to all locations in which the Service has
   * activity. For service types that don't support breaking down by location,
   * setting this field will result in an error.
   * </pre>
   *
   * <code>repeated string location = 8;</code>
   */
  com.google.protobuf.ByteString getLocationBytes(int index);

  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry
   * from other API versions will not be used to calculate performance for this
   * SLI. If omitted, this SLI applies to all API versions. For service types
   * that don't support breaking down by version, setting this field will result
   * in an error.
   * </pre>
   *
   * <code>repeated string version = 9;</code>
   */
  java.util.List<java.lang.String> getVersionList();
  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry
   * from other API versions will not be used to calculate performance for this
   * SLI. If omitted, this SLI applies to all API versions. For service types
   * that don't support breaking down by version, setting this field will result
   * in an error.
   * </pre>
   *
   * <code>repeated string version = 9;</code>
   */
  int getVersionCount();
  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry
   * from other API versions will not be used to calculate performance for this
   * SLI. If omitted, this SLI applies to all API versions. For service types
   * that don't support breaking down by version, setting this field will result
   * in an error.
   * </pre>
   *
   * <code>repeated string version = 9;</code>
   */
  java.lang.String getVersion(int index);
  /**
   *
   *
   * <pre>
   * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry
   * from other API versions will not be used to calculate performance for this
   * SLI. If omitted, this SLI applies to all API versions. For service types
   * that don't support breaking down by version, setting this field will result
   * in an error.
   * </pre>
   *
   * <code>repeated string version = 9;</code>
   */
  com.google.protobuf.ByteString getVersionBytes(int index);

  /**
   *
   *
   * <pre>
   * Good service is defined to be the count of requests made to this service
   * that return successfully.
   * </pre>
   *
   * <code>.google.monitoring.v3.BasicSli.AvailabilityCriteria availability = 2;</code>
   */
  boolean hasAvailability();
  /**
   *
   *
   * <pre>
   * Good service is defined to be the count of requests made to this service
   * that return successfully.
   * </pre>
   *
   * <code>.google.monitoring.v3.BasicSli.AvailabilityCriteria availability = 2;</code>
   */
  com.google.monitoring.v3.BasicSli.AvailabilityCriteria getAvailability();
  /**
   *
   *
   * <pre>
   * Good service is defined to be the count of requests made to this service
   * that return successfully.
   * </pre>
   *
   * <code>.google.monitoring.v3.BasicSli.AvailabilityCriteria availability = 2;</code>
   */
  com.google.monitoring.v3.BasicSli.AvailabilityCriteriaOrBuilder getAvailabilityOrBuilder();

  /**
   *
   *
   * <pre>
   * Good service is defined to be the count of requests made to this service
   * that are fast enough with respect to `latency.threshold`.
   * </pre>
   *
   * <code>.google.monitoring.v3.BasicSli.LatencyCriteria latency = 3;</code>
   */
  boolean hasLatency();
  /**
   *
   *
   * <pre>
   * Good service is defined to be the count of requests made to this service
   * that are fast enough with respect to `latency.threshold`.
   * </pre>
   *
   * <code>.google.monitoring.v3.BasicSli.LatencyCriteria latency = 3;</code>
   */
  com.google.monitoring.v3.BasicSli.LatencyCriteria getLatency();
  /**
   *
   *
   * <pre>
   * Good service is defined to be the count of requests made to this service
   * that are fast enough with respect to `latency.threshold`.
   * </pre>
   *
   * <code>.google.monitoring.v3.BasicSli.LatencyCriteria latency = 3;</code>
   */
  com.google.monitoring.v3.BasicSli.LatencyCriteriaOrBuilder getLatencyOrBuilder();

  public com.google.monitoring.v3.BasicSli.SliCriteriaCase getSliCriteriaCase();
}
