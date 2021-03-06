/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

namespace cpp2 apache.thrift.test

cpp_include "thrift/test/CppAllocatorTest.h"

struct UsesAllocatorChild {
  1: list<i32> (cpp.use_allocator, cpp.template = "::ThrowingVector") aa_list;
  2: set<i32> (cpp.use_allocator, cpp.template = "::ThrowingSet") aa_set;
  3: map<i32, i32> (cpp.use_allocator, cpp.template = "::ThrowingMap") aa_map;
  4: string (cpp_use_allocator, cpp.type = "::ThrowingString") aa_string;
  5: i32 not_a_container;
  6: list<i32> not_aa_list;
  7: set<i32> not_aa_set;
  8: map<i32, i32> not_aa_map;
  9: string not_aa_string;
} (cpp.allocator="::ScopedThrowingAlloc")

struct UsesAllocatorParent {
  1: UsesAllocatorChild (cpp.use_allocator) child;
} (cpp.allocator="::ScopedThrowingAlloc")

struct AAStruct {
  1: i32 foo;
} (cpp.allocator="::ScopedStatefulAlloc")

struct NoAllocatorVia  {
  1: AAStruct (cpp.use_allocator) foo;
} (cpp.allocator="::ScopedStatefulAlloc")

struct YesAllocatorVia  {
  1: AAStruct (cpp.use_allocator) foo;
} (cpp.allocator="::ScopedStatefulAlloc", cpp.allocator_via="foo")
