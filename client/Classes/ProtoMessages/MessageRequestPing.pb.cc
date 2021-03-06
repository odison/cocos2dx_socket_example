// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageRequestPing.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "MessageRequestPing.pb.h"

#include <algorithm>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/io/zero_copy_stream_impl_lite.h>
// @@protoc_insertion_point(includes)

void protobuf_ShutdownFile_MessageRequestPing_2eproto() {
  delete MessageRequestPing::default_instance_;
}

#ifdef GOOGLE_PROTOBUF_NO_STATIC_INITIALIZER
void protobuf_AddDesc_MessageRequestPing_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

#else
void protobuf_AddDesc_MessageRequestPing_2eproto() {
  static bool already_here = false;
  if (already_here) return;
  already_here = true;
  GOOGLE_PROTOBUF_VERIFY_VERSION;

#endif
  MessageRequestPing::default_instance_ = new MessageRequestPing();
  MessageRequestPing::default_instance_->InitAsDefaultInstance();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_MessageRequestPing_2eproto);
}

#ifdef GOOGLE_PROTOBUF_NO_STATIC_INITIALIZER
GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AddDesc_MessageRequestPing_2eproto_once_);
void protobuf_AddDesc_MessageRequestPing_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AddDesc_MessageRequestPing_2eproto_once_,
                 &protobuf_AddDesc_MessageRequestPing_2eproto_impl);
}
#else
// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_MessageRequestPing_2eproto {
  StaticDescriptorInitializer_MessageRequestPing_2eproto() {
    protobuf_AddDesc_MessageRequestPing_2eproto();
  }
} static_descriptor_initializer_MessageRequestPing_2eproto_;
#endif

namespace {

static void MergeFromFail(int line) GOOGLE_ATTRIBUTE_COLD;
static void MergeFromFail(int line) {
  GOOGLE_CHECK(false) << __FILE__ << ":" << line;
}

}  // namespace


// ===================================================================

#ifndef _MSC_VER
const int MessageRequestPing::kSomeTextFieldNumber;
#endif  // !_MSC_VER

MessageRequestPing::MessageRequestPing()
  : ::google::protobuf::MessageLite(), _arena_ptr_(NULL) {
  SharedCtor();
  // @@protoc_insertion_point(constructor:MessageRequestPing)
}

void MessageRequestPing::InitAsDefaultInstance() {
}

MessageRequestPing::MessageRequestPing(const MessageRequestPing& from)
  : ::google::protobuf::MessageLite(),
    _arena_ptr_(NULL) {
  SharedCtor();
  MergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:MessageRequestPing)
}

void MessageRequestPing::SharedCtor() {
  ::google::protobuf::internal::GetEmptyString();
  _cached_size_ = 0;
  sometext_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
}

MessageRequestPing::~MessageRequestPing() {
  // @@protoc_insertion_point(destructor:MessageRequestPing)
  SharedDtor();
}

void MessageRequestPing::SharedDtor() {
  sometext_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  #ifdef GOOGLE_PROTOBUF_NO_STATIC_INITIALIZER
  if (this != &default_instance()) {
  #else
  if (this != default_instance_) {
  #endif
  }
}

void MessageRequestPing::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const MessageRequestPing& MessageRequestPing::default_instance() {
#ifdef GOOGLE_PROTOBUF_NO_STATIC_INITIALIZER
  protobuf_AddDesc_MessageRequestPing_2eproto();
#else
  if (default_instance_ == NULL) protobuf_AddDesc_MessageRequestPing_2eproto();
#endif
  return *default_instance_;
}

MessageRequestPing* MessageRequestPing::default_instance_ = NULL;

MessageRequestPing* MessageRequestPing::New(::google::protobuf::Arena* arena) const {
  MessageRequestPing* n = new MessageRequestPing;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void MessageRequestPing::Clear() {
  if (has_sometext()) {
    sometext_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  }
  ::memset(_has_bits_, 0, sizeof(_has_bits_));
  mutable_unknown_fields()->clear();
}

bool MessageRequestPing::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  ::google::protobuf::io::StringOutputStream unknown_fields_string(
      mutable_unknown_fields());
  ::google::protobuf::io::CodedOutputStream unknown_fields_stream(
      &unknown_fields_string);
  // @@protoc_insertion_point(parse_start:MessageRequestPing)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // required string someText = 1 [default = ""];
      case 1: {
        if (tag == 10) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_sometext()));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectAtEnd()) goto success;
        break;
      }

      default: {
      handle_unusual:
        if (tag == 0 ||
            ::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          goto success;
        }
        DO_(::google::protobuf::internal::WireFormatLite::SkipField(
            input, tag, &unknown_fields_stream));
        break;
      }
    }
  }
success:
  // @@protoc_insertion_point(parse_success:MessageRequestPing)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:MessageRequestPing)
  return false;
#undef DO_
}

void MessageRequestPing::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:MessageRequestPing)
  // required string someText = 1 [default = ""];
  if (has_sometext()) {
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      1, this->sometext(), output);
  }

  output->WriteRaw(unknown_fields().data(),
                   unknown_fields().size());
  // @@protoc_insertion_point(serialize_end:MessageRequestPing)
}

int MessageRequestPing::ByteSize() const {
  int total_size = 0;

  // required string someText = 1 [default = ""];
  if (has_sometext()) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->sometext());
  }
  total_size += unknown_fields().size();

  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = total_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void MessageRequestPing::CheckTypeAndMergeFrom(
    const ::google::protobuf::MessageLite& from) {
  MergeFrom(*::google::protobuf::down_cast<const MessageRequestPing*>(&from));
}

void MessageRequestPing::MergeFrom(const MessageRequestPing& from) {
  if (GOOGLE_PREDICT_FALSE(&from == this)) MergeFromFail(__LINE__);
  if (from._has_bits_[0 / 32] & (0xffu << (0 % 32))) {
    if (from.has_sometext()) {
      set_has_sometext();
      sometext_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.sometext_);
    }
  }
  mutable_unknown_fields()->append(from.unknown_fields());
}

void MessageRequestPing::CopyFrom(const MessageRequestPing& from) {
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool MessageRequestPing::IsInitialized() const {
  if ((_has_bits_[0] & 0x00000001) != 0x00000001) return false;

  return true;
}

void MessageRequestPing::Swap(MessageRequestPing* other) {
  if (other == this) return;
  InternalSwap(other);
}
void MessageRequestPing::InternalSwap(MessageRequestPing* other) {
  sometext_.Swap(&other->sometext_);
  std::swap(_has_bits_[0], other->_has_bits_[0]);
  _unknown_fields_.swap(other->_unknown_fields_);
  std::swap(_cached_size_, other->_cached_size_);
}

::std::string MessageRequestPing::GetTypeName() const {
  return "MessageRequestPing";
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// MessageRequestPing

// required string someText = 1 [default = ""];
bool MessageRequestPing::has_sometext() const {
  return (_has_bits_[0] & 0x00000001u) != 0;
}
void MessageRequestPing::set_has_sometext() {
  _has_bits_[0] |= 0x00000001u;
}
void MessageRequestPing::clear_has_sometext() {
  _has_bits_[0] &= ~0x00000001u;
}
void MessageRequestPing::clear_sometext() {
  sometext_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  clear_has_sometext();
}
 const ::std::string& MessageRequestPing::sometext() const {
  // @@protoc_insertion_point(field_get:MessageRequestPing.someText)
  return sometext_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 void MessageRequestPing::set_sometext(const ::std::string& value) {
  set_has_sometext();
  sometext_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:MessageRequestPing.someText)
}
 void MessageRequestPing::set_sometext(const char* value) {
  set_has_sometext();
  sometext_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:MessageRequestPing.someText)
}
 void MessageRequestPing::set_sometext(const char* value, size_t size) {
  set_has_sometext();
  sometext_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:MessageRequestPing.someText)
}
 ::std::string* MessageRequestPing::mutable_sometext() {
  set_has_sometext();
  // @@protoc_insertion_point(field_mutable:MessageRequestPing.someText)
  return sometext_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 ::std::string* MessageRequestPing::release_sometext() {
  clear_has_sometext();
  return sometext_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 void MessageRequestPing::set_allocated_sometext(::std::string* sometext) {
  if (sometext != NULL) {
    set_has_sometext();
  } else {
    clear_has_sometext();
  }
  sometext_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), sometext);
  // @@protoc_insertion_point(field_set_allocated:MessageRequestPing.someText)
}

#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

// @@protoc_insertion_point(global_scope)
