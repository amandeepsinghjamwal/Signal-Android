/*
 * Copyright 2025 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.whispersystems.signalservice.api.donations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request JSON for creating a PayPal one-time payment intent
 */
class PayPalCreateOneTimePaymentIntentPayload {
  @JsonProperty
  private long amount;

  @JsonProperty
  private String currency;

  @JsonProperty
  private long level;

  @JsonProperty
  private String returnUrl;

  @JsonProperty
  private String cancelUrl;

  public PayPalCreateOneTimePaymentIntentPayload(long amount, String currency, long level, String returnUrl, String cancelUrl) {
    this.amount    = amount;
    this.currency  = currency;
    this.level     = level;
    this.returnUrl = returnUrl;
    this.cancelUrl = cancelUrl;
  }
}
