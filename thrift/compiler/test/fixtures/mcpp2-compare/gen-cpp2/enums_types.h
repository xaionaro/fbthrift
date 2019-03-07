/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#pragma once

#include <thrift/lib/cpp2/GeneratedHeaderHelper.h>
#include <thrift/lib/cpp2/Thrift.h>
#include <thrift/lib/cpp2/gen/module_types_h.h>
#include <thrift/lib/cpp2/protocol/Protocol.h>


// BEGIN declare_enums
namespace facebook { namespace ns { namespace qwerty {

enum class AnEnumA {
  FIELDA = 0
};

using _AnEnumA_EnumMapFactory = apache::thrift::detail::TEnumMapFactory<AnEnumA, AnEnumA>;
extern const _AnEnumA_EnumMapFactory::ValuesToNamesMapType _AnEnumA_VALUES_TO_NAMES;
extern const _AnEnumA_EnumMapFactory::NamesToValuesMapType _AnEnumA_NAMES_TO_VALUES;



enum class AnEnumB {
  FIELDA = 0,
  FIELDB = 2
};

using _AnEnumB_EnumMapFactory = apache::thrift::detail::TEnumMapFactory<AnEnumB, AnEnumB>;
extern const _AnEnumB_EnumMapFactory::ValuesToNamesMapType _AnEnumB_VALUES_TO_NAMES;
extern const _AnEnumB_EnumMapFactory::NamesToValuesMapType _AnEnumB_NAMES_TO_VALUES;



enum class AnEnumC {
  FIELDC = 0
};

using _AnEnumC_EnumMapFactory = apache::thrift::detail::TEnumMapFactory<AnEnumC, AnEnumC>;
extern const _AnEnumC_EnumMapFactory::ValuesToNamesMapType _AnEnumC_VALUES_TO_NAMES;
extern const _AnEnumC_EnumMapFactory::NamesToValuesMapType _AnEnumC_NAMES_TO_VALUES;



enum class AnEnumD {
  FIELDD = 0
};

using _AnEnumD_EnumMapFactory = apache::thrift::detail::TEnumMapFactory<AnEnumD, AnEnumD>;
extern const _AnEnumD_EnumMapFactory::ValuesToNamesMapType _AnEnumD_VALUES_TO_NAMES;
extern const _AnEnumD_EnumMapFactory::NamesToValuesMapType _AnEnumD_NAMES_TO_VALUES;



enum class AnEnumE {
  FIELDA = 0
};

using _AnEnumE_EnumMapFactory = apache::thrift::detail::TEnumMapFactory<AnEnumE, AnEnumE>;
extern const _AnEnumE_EnumMapFactory::ValuesToNamesMapType _AnEnumE_VALUES_TO_NAMES;
extern const _AnEnumE_EnumMapFactory::NamesToValuesMapType _AnEnumE_NAMES_TO_VALUES;



}}} // facebook::ns::qwerty
namespace std {


template<> struct hash<typename  ::facebook::ns::qwerty::AnEnumA> : public apache::thrift::detail::enum_hash<typename  ::facebook::ns::qwerty::AnEnumA> {};
template<> struct equal_to<typename  ::facebook::ns::qwerty::AnEnumA> : public apache::thrift::detail::enum_equal_to<typename  ::facebook::ns::qwerty::AnEnumA> {};


template<> struct hash<typename  ::facebook::ns::qwerty::AnEnumB> : public apache::thrift::detail::enum_hash<typename  ::facebook::ns::qwerty::AnEnumB> {};
template<> struct equal_to<typename  ::facebook::ns::qwerty::AnEnumB> : public apache::thrift::detail::enum_equal_to<typename  ::facebook::ns::qwerty::AnEnumB> {};


template<> struct hash<typename  ::facebook::ns::qwerty::AnEnumC> : public apache::thrift::detail::enum_hash<typename  ::facebook::ns::qwerty::AnEnumC> {};
template<> struct equal_to<typename  ::facebook::ns::qwerty::AnEnumC> : public apache::thrift::detail::enum_equal_to<typename  ::facebook::ns::qwerty::AnEnumC> {};


template<> struct hash<typename  ::facebook::ns::qwerty::AnEnumD> : public apache::thrift::detail::enum_hash<typename  ::facebook::ns::qwerty::AnEnumD> {};
template<> struct equal_to<typename  ::facebook::ns::qwerty::AnEnumD> : public apache::thrift::detail::enum_equal_to<typename  ::facebook::ns::qwerty::AnEnumD> {};


template<> struct hash<typename  ::facebook::ns::qwerty::AnEnumE> : public apache::thrift::detail::enum_hash<typename  ::facebook::ns::qwerty::AnEnumE> {};
template<> struct equal_to<typename  ::facebook::ns::qwerty::AnEnumE> : public apache::thrift::detail::enum_equal_to<typename  ::facebook::ns::qwerty::AnEnumE> {};


} // std

namespace apache { namespace thrift {


template <> struct TEnumDataStorage< ::facebook::ns::qwerty::AnEnumA>;

template <> struct TEnumTraits< ::facebook::ns::qwerty::AnEnumA> {
  using type =  ::facebook::ns::qwerty::AnEnumA;

  static constexpr std::size_t const size = 1;
  static folly::Range<type const*> const values;
  static folly::Range<folly::StringPiece const*> const names;

  static char const* findName(type value);
  static bool findValue(char const* name, type* out);

  static constexpr type min() { return type::FIELDA; }
  static constexpr type max() { return type::FIELDA; }
};


template <> struct TEnumDataStorage< ::facebook::ns::qwerty::AnEnumB>;

template <> struct TEnumTraits< ::facebook::ns::qwerty::AnEnumB> {
  using type =  ::facebook::ns::qwerty::AnEnumB;

  static constexpr std::size_t const size = 2;
  static folly::Range<type const*> const values;
  static folly::Range<folly::StringPiece const*> const names;

  static char const* findName(type value);
  static bool findValue(char const* name, type* out);

  static constexpr type min() { return type::FIELDA; }
  static constexpr type max() { return type::FIELDB; }
};


template <> struct TEnumDataStorage< ::facebook::ns::qwerty::AnEnumC>;

template <> struct TEnumTraits< ::facebook::ns::qwerty::AnEnumC> {
  using type =  ::facebook::ns::qwerty::AnEnumC;

  static constexpr std::size_t const size = 1;
  static folly::Range<type const*> const values;
  static folly::Range<folly::StringPiece const*> const names;

  static char const* findName(type value);
  static bool findValue(char const* name, type* out);

  static constexpr type min() { return type::FIELDC; }
  static constexpr type max() { return type::FIELDC; }
};


template <> struct TEnumDataStorage< ::facebook::ns::qwerty::AnEnumD>;

template <> struct TEnumTraits< ::facebook::ns::qwerty::AnEnumD> {
  using type =  ::facebook::ns::qwerty::AnEnumD;

  static constexpr std::size_t const size = 1;
  static folly::Range<type const*> const values;
  static folly::Range<folly::StringPiece const*> const names;

  static char const* findName(type value);
  static bool findValue(char const* name, type* out);

  static constexpr type min() { return type::FIELDD; }
  static constexpr type max() { return type::FIELDD; }
};


template <> struct TEnumDataStorage< ::facebook::ns::qwerty::AnEnumE>;

template <> struct TEnumTraits< ::facebook::ns::qwerty::AnEnumE> {
  using type =  ::facebook::ns::qwerty::AnEnumE;

  static constexpr std::size_t const size = 1;
  static folly::Range<type const*> const values;
  static folly::Range<folly::StringPiece const*> const names;

  static char const* findName(type value);
  static bool findValue(char const* name, type* out);

  static constexpr type min() { return type::FIELDA; }
  static constexpr type max() { return type::FIELDA; }
};


}} // apache::thrift


// END declare_enums
// BEGIN struct_indirection

// END struct_indirection
// BEGIN forward_declare
namespace facebook { namespace ns { namespace qwerty {
class SomeStruct;
}}} // facebook::ns::qwerty
// END forward_declare
// BEGIN typedefs

// END typedefs
// BEGIN hash_and_equal_to
// END hash_and_equal_to
namespace facebook { namespace ns { namespace qwerty {
class SomeStruct final : private apache::thrift::detail::st::ComparisonOperators<SomeStruct> {
 public:

  SomeStruct() :
      fieldA(0) {}
  // FragileConstructor for use in initialization lists only.
  SomeStruct(apache::thrift::FragileConstructor, int32_t fieldA__arg);
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<1, _T> arg) {
    fieldA = arg.extract();
    __isset.fieldA = true;
  }

  SomeStruct(SomeStruct&&) = default;

  SomeStruct(const SomeStruct&) = default;

  SomeStruct& operator=(SomeStruct&&) = default;

  SomeStruct& operator=(const SomeStruct&) = default;
  void __clear();
  int32_t fieldA;

  struct __isset {
    bool fieldA;
  } __isset = {};
  bool operator==(const SomeStruct& rhs) const;
  bool operator<(const SomeStruct& rhs) const;

  int32_t get_fieldA() const {
    return fieldA;
  }

  int32_t& set_fieldA(int32_t fieldA_) {
    fieldA = fieldA_;
    __isset.fieldA = true;
    return fieldA;
  }

  template <class Protocol_>
  uint32_t read(Protocol_* iprot);
  template <class Protocol_>
  uint32_t serializedSize(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t serializedSizeZC(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t write(Protocol_* prot_) const;

 private:
  template <class Protocol_>
  void readNoXfer(Protocol_* iprot);

  friend class ::apache::thrift::Cpp2Ops< SomeStruct >;
};

void swap(SomeStruct& a, SomeStruct& b);
extern template void SomeStruct::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
extern template uint32_t SomeStruct::write<>(apache::thrift::BinaryProtocolWriter*) const;
extern template uint32_t SomeStruct::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template uint32_t SomeStruct::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template void SomeStruct::readNoXfer<>(apache::thrift::CompactProtocolReader*);
extern template uint32_t SomeStruct::write<>(apache::thrift::CompactProtocolWriter*) const;
extern template uint32_t SomeStruct::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
extern template uint32_t SomeStruct::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;
extern template void SomeStruct::readNoXfer<>(apache::thrift::SimpleJSONProtocolReader*);
extern template uint32_t SomeStruct::write<>(apache::thrift::SimpleJSONProtocolWriter*) const;
extern template uint32_t SomeStruct::serializedSize<>(apache::thrift::SimpleJSONProtocolWriter const*) const;
extern template uint32_t SomeStruct::serializedSizeZC<>(apache::thrift::SimpleJSONProtocolWriter const*) const;

template <class Protocol_>
uint32_t SomeStruct::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCurrentPosition().getCurrentPosition();
  readNoXfer(iprot);
  return iprot->getCurrentPosition().getCurrentPosition() - _xferStart;
}

}}} // facebook::ns::qwerty
