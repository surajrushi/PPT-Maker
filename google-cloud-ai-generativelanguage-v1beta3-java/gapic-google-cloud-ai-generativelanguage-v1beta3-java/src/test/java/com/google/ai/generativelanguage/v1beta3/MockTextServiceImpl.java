/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ai.generativelanguage.v1beta3;

import com.google.ai.generativelanguage.v1beta3.TextServiceGrpc.TextServiceImplBase;
import com.google.api.core.BetaApi;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockTextServiceImpl extends TextServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockTextServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void generateText(
      GenerateTextRequest request, StreamObserver<GenerateTextResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof GenerateTextResponse) {
      requests.add(request);
      responseObserver.onNext(((GenerateTextResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GenerateText, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  GenerateTextResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void embedText(
      EmbedTextRequest request, StreamObserver<EmbedTextResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof EmbedTextResponse) {
      requests.add(request);
      responseObserver.onNext(((EmbedTextResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method EmbedText, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  EmbedTextResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void batchEmbedText(
      BatchEmbedTextRequest request, StreamObserver<BatchEmbedTextResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof BatchEmbedTextResponse) {
      requests.add(request);
      responseObserver.onNext(((BatchEmbedTextResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method BatchEmbedText, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  BatchEmbedTextResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void countTextTokens(
      CountTextTokensRequest request, StreamObserver<CountTextTokensResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof CountTextTokensResponse) {
      requests.add(request);
      responseObserver.onNext(((CountTextTokensResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CountTextTokens, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  CountTextTokensResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
